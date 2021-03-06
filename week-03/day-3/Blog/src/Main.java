public class Main {
  public static void main(String[] args) {
    BlogPost lorem = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost wait = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost one = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
    Blog list = new Blog("Blabla Blog");
    list.addPost(lorem);
    list.addPost(wait);
    list.addPost(one);

    list.delete(2);
    list.checkListTitles();

    BlogPost newOne = new BlogPost("Krisztinka", "Krisztinka's world", "I keep a close watch on this heart of mine \nI keep my eyes wide open all the time", "2018.08.20.");
    list.update(0, newOne);
    list.checkListTitles();
    list.checkText(0);
  }
}
