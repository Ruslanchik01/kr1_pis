import java.util.ArrayList;

class Section extends Component{
    private ArrayList<Component> chapters = new ArrayList<Component>();
    public Section(String name, int pages){
        super(name, pages);
    }

    @Override
    public void add(Component c) {
        chapters.add(c);
    }

    @Override
    public void remove(Component c) {
        chapters.remove(c);
    }

    @Override
    public void display() {
        System.out.println("Section:" + getName() + "(" + getPages() + " p.)");
        System.out.println("Chapters:");
        for(int i = 0; i < chapters.size();i++){
            chapters.get(i).display();
        }
    }
}