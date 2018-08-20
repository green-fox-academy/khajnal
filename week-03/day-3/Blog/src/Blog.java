import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listofPosts = new ArrayList<>();
  String name;

  public Blog(String name) {
    this.name = name;
  }
  public void addPost(BlogPost name) {
    listofPosts.add(name);
  }
  public void delete(int index) {
    listofPosts.remove(index);
  }
  public void checkListTitles() {
    for (int i = 0; i < listofPosts.size(); i++) {
      System.out.println(listofPosts.get(i).title);
    }
  }
  public List<BlogPost> update(int index, BlogPost blogpost) {
    listofPosts.set(index, blogpost);
    return listofPosts;
  }
  public void checkText(int index) {
    System.out.println(listofPosts.get(index).text);
  }
}