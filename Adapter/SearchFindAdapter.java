package Adapter;

class SearchFindAdapter implements SearchStrategy{
    private FindAlgorithm findAlgorithm;
    
    public SearchFindAdapter(FindAlgorithm _findAlgorithm){
        findAlgorithm = _findAlgorithm;
    }
    @Override
    public void search() {
        // TODO Auto-generated method stub
        findAlgorithm.find(true);
    }
}