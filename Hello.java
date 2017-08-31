class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Ging();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
	 private void Ging() {
        System.out.println("Student - Adisak Sorin");
    }
}
