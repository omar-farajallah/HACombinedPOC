import ReactHabitat from 'react-habitat';

class Main extends ReactHabitat.Bootstrapper {

  constructor(){

    super();

    // Create a new container
    var container = new ReactHabitat.Container();

    // Set the DOM container
    this.setContainer(container);

  }
}


export default new Main();