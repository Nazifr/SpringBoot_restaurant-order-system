package com.nazifr.FoodOrderingService.enumsNur;


public enum Role {
    ROLE_ADMIN("Admin"),
    ROLE_RESTAURANT_OWNER("Restaurant Owner"),
    ROLE_WAITER("Waiter");

    private String value;
    Role(String value) {this.value = value;}
    public String getValue() {return value;}
}
