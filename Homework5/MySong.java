public class MySong
{
    private String title;
    private int rating;
    
    public MySong(String title, int rating)
    {
        this.title = title;
        this.rating = rating;
    }
    
    public String getTitle()
    {
        return this.title;
    } // end method getTitle
    
    public void setTitle(String title)
    {
        this.title = title;
    } // end method setTitle
    
    public int getRating()
    {
        return this.rating;
    } // end method getRating
    
    public void setRating(int rating)
    {
        this.rating = rating;
    } // end method setRating
    
    public String toString()
    {
        return this.title;
    }
} // end class MySong