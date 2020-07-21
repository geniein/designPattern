package Adapter;

interface SearchStrategy {
    public void search();    
}

class SearchStrategyAll implements SearchStrategy{
    @Override
    public void search() {
        // TODO Auto-generated method stub
        System.out.println("SEARCH ALL");
    }
}

class SearchStrategyImage implements SearchStrategy{
    @Override
    public void search() {
        // TODO Auto-generated method stub
        System.out.println("SEARCH ALL");
    }
}
class SearchStrategyNews implements SearchStrategy{
    @Override
    public void search() {
        // TODO Auto-generated method stub
        System.out.println("SEARCH ALL");
    }
}
class SearchStrategyMap implements SearchStrategy{
    @Override
    public void search() {
        // TODO Auto-generated method stub
        System.out.println("SEARCH ALL");
    }
}