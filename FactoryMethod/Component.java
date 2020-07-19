package FactoryMethod;

abstract class Component {
    protected abstract String getCompName();
    public Component() {
        System.out.println(this.getCompName()+ " create");
    }
}

class Button extends Component{
    @Override
    protected String getCompName() {
        // TODO Auto-generated method stub
        return "Button";
    }
}

class Switch extends Component{
    @Override
    protected String getCompName() {
        // TODO Auto-generated method stub
        return "Switch";
    }
}
class Dropdown extends Component{
    @Override
    protected String getCompName() {
        // TODO Auto-generated method stub
        return "Dropdown";
    }
}