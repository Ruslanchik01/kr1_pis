abstract class Component{
    private String name;
    private int pages;

    public Component(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    protected String getName(){
        return this.name;
    }
    protected int getPages(){
        return this.pages;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display();
}
