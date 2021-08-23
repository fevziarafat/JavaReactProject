package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
@Entity
@Table(name="business_owners")
public class Business_owners implements List<Business_owners> {
   @Id
   @GeneratedValue
   @Column(name="id")
   private int id;

   @Column(name="company_name")
   private String company_name;

   @Column(name="web_site_address")
   private String web_site_address;

   @Column(name="telephone")
   private String telephone;

   @Column(name="password")
   private String password;

   @Column(name="is_active")
   private boolean is_active;

   @Column(name="e_mail")
   private int e_mail;

   public Business_owners(int id, String company_name, String web_site_address, String telephone, String password, boolean is_active, int e_mail) {
      this.id = id;
      this.company_name = company_name;
      this.web_site_address = web_site_address;
      this.telephone = telephone;
      this.password = password;
      this.is_active = is_active;
      this.e_mail = e_mail;
   }

   public Business_owners() {

   }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Business_owners> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Business_owners business_owners) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Business_owners> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Business_owners> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Business_owners get(int index) {
        return null;
    }

    @Override
    public Business_owners set(int index, Business_owners element) {
        return null;
    }

    @Override
    public void add(int index, Business_owners element) {

    }

    @Override
    public Business_owners remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Business_owners> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Business_owners> listIterator(int index) {
        return null;
    }

    @Override
    public List<Business_owners> subList(int fromIndex, int toIndex) {
        return null;
    }
}
