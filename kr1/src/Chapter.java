import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class Chapter extends Component{
    public Chapter(String name, int pages){
        super(name, pages);
    }

    @Override
    public void add(Component c) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Component c) {
        throw new NotImplementedException();
    }

    @Override
    public void display() {
        System.out.println("\tChapter name:" + getName()+ "(" + getPages() + " p.)");
    }
}