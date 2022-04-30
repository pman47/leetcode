class ParkingSystem {
    int[] a = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        this.a[0] = big;
        this.a[1] = medium;
        this.a[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(a[carType-1]==0) return false;
        a[carType-1]--;
        return true;
    }
}