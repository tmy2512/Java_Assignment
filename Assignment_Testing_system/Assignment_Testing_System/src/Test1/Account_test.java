package Test1;

import java.util.Date;

public class Account_test {
   private String email;
   private String username;
   private String fullname;
   private Date createDate;
public Account_test() {}
   public Account_test(String email, String username, String fullname, Date createDate) {
      this.email = email;
      this.username = username;
      this.fullname = fullname;
      this.createDate = createDate;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getFullname() {
      return fullname;
   }

   public void setFullname(String fullname) {
      this.fullname = fullname;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }
}
