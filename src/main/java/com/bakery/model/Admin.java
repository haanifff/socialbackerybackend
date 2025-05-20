package model;

/**
 * Represents an admin user in the bakery system, extends User
 */
public class Admin extends User {
    private String role;
    
    /**
     * Default constructor
     */
    public Admin() {
    }
    
    /**
     * Constructor with parameters
     * 
     * @param id unique identifier
     * @param username admin's username
     * @param password admin's password
     * @param role admin's role
     */
    public Admin(int id, String username, String password, String role) {
        super(id, username, password);
        this.role = role;
    }
    
    /**
     * Gets the admin's role
     * 
     * @return the role
     */
    public String getRole() {
        return role;
    }
    
    /**
     * Sets the admin's role
     * 
     * @param role the new role
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * Adds a product to the system
     * 
     * @param product the product to add
     */
    public void addProduct(Product product) {
        // Implementation for adding a product
        // This would typically interact with a repository or service
    }
    
    /**
     * Updates a product in the system
     * 
     * @param productId the ID of the product to update
     * @param newDetails the updated product details
     */
    public void updateProduct(int productId, Product newDetails) {
        // Implementation for updating a product
        // This would typically interact with a repository or service
    }
    
    /**
     * Deletes a product from the system
     * 
     * @param productId the ID of the product to delete
     */
    public void deleteProduct(int productId) {
        // Implementation for deleting a product
        // This would typically interact with a repository or service
    }
    
    /**
     * Adds a category to the system
     * 
     * @param category the category to add
     */
    public void addCategory(Category category) {
        // Implementation for adding a category
        // This would typically interact with a repository or service
    }
    
    /**
     * Updates an order's status
     * 
     * @param orderId the ID of the order to update
     * @param newStatus the new status
     */
    public void updateOrderStatus(int orderId, String newStatus) {
        // Implementation for updating an order's status
        // This would typically interact with a repository or service
    }
}