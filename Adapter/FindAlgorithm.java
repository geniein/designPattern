package Adapter;

interface FindAlgorithm {
    public void find (boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm{
    @Override
    public void find(boolean global) {
        // TODO Auto-generated method stub
        System.out.println("Find Movie " + global);
    }
}