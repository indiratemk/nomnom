package io.nomnom.entities;


import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int category_id;

    @Column(name = "category_title")
    private String category_title;

    public Category() {
    }

    public Category(String category_title) {
        this.category_title = category_title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_title() {
        return category_title;
    }

    public void setCategory_title(String category_title) {
        this.category_title = category_title;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_title='" + category_title + '\'' +
                '}';
    }
}
