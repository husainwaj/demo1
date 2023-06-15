package com.example.demo1;

class Organization {
    String name;
    double annualRevenue;
    boolean isProfitMaking;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Profit-making: " + isProfitMaking);
    }
}

class OrganizationInfo {
    public static void main(String[] args) {
        Organization organization1 = new Organization();
        organization1.name = "XYZ Company";
        organization1.annualRevenue = 100000.00;
        organization1.isProfitMaking = true;

        Organization organization2 = new Organization();
        organization2.name = "Disaster Aid Group";
        organization2.annualRevenue = 0.00;
        organization2.isProfitMaking = false;

        System.out.println("Organization 1:");
        organization1.displayInfo();

        System.out.println("\nOrganization 2:");
        organization2.displayInfo();
    }
}

class FoodProduct {
    String type;
    double weight;
    double cost;
    int servings;
    int caloriesPerServing;

    void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Cost: $" + cost);
        System.out.println("Servings: " + servings);
        System.out.println("Calories per Serving: " + caloriesPerServing);
    }
}

class FoodProductInfo {
    public static void main(String[] args) {
        FoodProduct product1 = new FoodProduct();
        product1.type = "Peach Slices";
        product1.weight = 500.0;
        product1.cost = 1.83;
        product1.servings = 4;
        product1.caloriesPerServing = 70;

        System.out.println("Product 1:");
        product1.displayInfo();
    }
}
