public class PantryManager {
    // Array to store item quantities
    private int[] quantities;
    private String[] itemNames;

    public PantryManager() {
        // Initializing with 5 basic items
        itemNames = new String[]{"Milk", "Eggs", "Bread", "Rice", "Apples"};
        quantities = new int[]{2, 12, 1, 5, 0};
    }

    /**
     * Logic: If current quantity + added amount > 20, return false (storage full).
     * Otherwise, update the array and return true.
     */
    public boolean restockItem(int index, int amount) {
        // TODO: Implement logic here
        return false;
    }

    /**
     * Logic: Return "Critical" if quantity is 0, 
     * "Low" if quantity is 1-3, and "OK" otherwise.
     */
    public String checkStatus(int index) {
        // TODO: Implement if-else logic here
        return "";
    }
}
