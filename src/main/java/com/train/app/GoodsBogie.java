package com.train.app;

public class GoodsBogie {

    private String type;
    private String cargo;

    // ✅ Constructor 1 (for UC12: direct assignment)
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // ✅ Constructor 2 (for UC15: assign later safely)
    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // ❌ Unsafe condition
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.");
        }
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}