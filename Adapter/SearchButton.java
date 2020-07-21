package Adapter;

public class SearchButton {
    private StrategyPattern strategyPattern;

    private MyProgram myProgram;
    
    public SearchButton (StrategyPattern _strategyPattern){
        strategyPattern = _strategyPattern;        
    }

    public SearchButton (MyProgram _myProgram){
        myProgram = _myProgram;        
    }

    private SearchStrategy searchStrategy = new SearchStrategyAll();

    public void setSearchStrategy (SearchStrategy _searchStrategy){
        searchStrategy = _searchStrategy;
    }

    public void onClick() {
        searchStrategy.search();
    }

    // public void onClick(){
    //     if(strategyPattern.mode == Mode.ALL){
    //         System.out.println("SEARCH ALL");
    //     } else if(strategyPattern.mode == Mode.IMAGE){
    //         System.out.println("SEARCH IMAGE");
    //     } else if(strategyPattern.mode == Mode.NEWS){
    //         System.out.println("SEARCH NEWS");
    //     } else if(strategyPattern.mode == Mode.MAP){
    //         System.out.println("SEARCH MAP");
    //     }
    // }
}