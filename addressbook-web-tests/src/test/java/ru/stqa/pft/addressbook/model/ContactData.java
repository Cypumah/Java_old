package ru.stqa.pft.addressbook.model;

public class ContactData {

  private int id = Integer.MAX_VALUE;
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String address;
  private final String homephone;
  private final String mobilephone;
  private final String notes;
  private String group;

  public ContactData(Integer id, String name, String middlename, String lastname, String nickname, String company, String address, String homephone, String mobilephone, String notes, String group) {
    this.id = id;
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.notes = notes;
    this.group = group;
  }

  public ContactData(String name, String middlename, String lastname, String nickname, String company, String address, String homephone, String mobilephone, String notes, String group) {
    this.id = 0;
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.notes = notes;
    this.group = group;
  }


  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;

  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getNotes() {
    return notes;
  }

  public String getGroup() {
    return group;
  }


}
