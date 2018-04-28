package it.dan.model;

import java.io.File;
import java.io.Serializable;

public class Item implements Serializable {

private String articleId;
private String name;
private Integer price;
private File img;

public Item() {
}

public Item(String articleId, String name, Integer price, File img) {
	this.articleId = articleId;
	this.name = name;
	this.price = price;
	this.img = img;
}

public String getArticleId() {
	return articleId;
}
public void setArticleId(String articleId) {
	this.articleId = articleId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public File getImg() {
	return img;
}
public void setImg(File img) {
	this.img = img;
}

}
