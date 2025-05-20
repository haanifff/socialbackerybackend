package com.bakery.model;

public class Review {
    private int id;
    private int productId;
    private int userId;
    private int rating;
    private String comment;
    
    // Constructors
    public Review() {
    }
    
    public Review(int id, int productId, int userId, int rating, String comment) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    // Methods from UML
    public int getRating() {
        return this.rating;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public void editReview(int newRating, String newComment) {
        this.rating = newRating;
        this.comment = newComment;
    }
    
    public void deleteReview() {
        // This would typically call a method in a service or repository
        // to remove the review from the database
        // Set all fields to null or default values to indicate deletion
        this.id = 0;
        this.productId = 0;
        this.userId = 0;
        this.rating = 0;
        this.comment = null;
    }
}