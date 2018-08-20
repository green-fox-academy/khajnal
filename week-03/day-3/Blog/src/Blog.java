import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listofPosts = new ArrayList<>();

  public void addPost(BlogPost name) {
    listofPosts.add(name);
  }
  public void delete(int index) {
    listofPosts.remove(index);
  }
  public void checkListTitles(){
    for (int i = 0; i < listofPosts.size(); i++) {
      System.out.println(listofPosts.get(i).title);
    }
  }
}
