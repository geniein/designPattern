package ProxyPattern;

interface Thumbnail {
    public void showTile();
    public void showPreview();
}

class RealThumbnail implements Thumbnail{
    private String title;
    private String movieUrl;

    public RealThumbnail (String _title, String _movieUrl){
        title = _title;
        movieUrl = _movieUrl;
        System.out.println(title + "From" + movieUrl);
    }

    public void showTile(){
        System.out.println("Title :" + title);
    }

    public void showPreview(){
        System.out.println(title+ "Preview Playing ");
    }
}

class ProxyThumbnail implements Thumbnail{
    private String title;
    private String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String _title, String _movieUrl){
        title = _title;
        movieUrl = _movieUrl;
    }
    public void showTile(){
        System.out.println("Title :" + title);
    }

    public void showPreview(){
        if( realThumbnail == null){
            realThumbnail = new RealThumbnail(title, movieUrl);
        }
        realThumbnail.showPreview();
    }
}