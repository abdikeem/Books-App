public class Books {

    private String name;
    private String authoe;
    private LocalDate datePublished;
    private int noOfpages;
    private String category;
    private boolean availability;
    private static ArrayList<Books> instances = new ArrayList<>();

    public Books(String name, String author, LocalDate datePublished, int noOfpages, String category, boolean availability);
        this.name = name;
        this .author = author;
        this.datePublished = noOfpages;
        this.category = category;
        this.availability = availability;
        instances.add(this);
  }
  public boolean changeAvailability(String name, String author){

    return !this.availability;
  }
  public static ArrayList
}


