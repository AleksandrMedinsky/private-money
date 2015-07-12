package com.privatemoney.operation;

import com.privatemoney.category.Category;
import com.privatemoney.category.SubCategory;
import com.privatemoney.type.Type;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public abstract class Operation {
    private BigDecimal sum;
    private Category category;
    private SubCategory subCategory;
    private Date date;
    private String notes;
    private Type type;
    private Currency currency;//todo: need acquainted with Currency docs

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "sum=" + sum +
                ", category=" + category +
                ", subCategory=" + subCategory +
                ", date=" + date +
                ", notes='" + notes + '\'' +
                ", type=" + type +
                ", currency=" + currency +
                '}';
    }
}
