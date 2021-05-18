import java.util.*;
public class Car implements Cloneable {
  private String str;
  private Date date;

  public Car(String str) {
     this.str = str;
  }
  public String getStr(){
    return str;
  }
  public void setDate(Date date) {
    this.date = new Date(date.getTime());
  }
  public Date getDate() {
    return date;
  }
  @Override
  public Object clone() throws CloneNotSupportedException {
    Car tmp = (Car)super.clone();
    return tmp;
  }
}
