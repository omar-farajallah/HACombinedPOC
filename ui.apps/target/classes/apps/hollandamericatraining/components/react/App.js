import ReactHabitat   from 'react-habitat';

// Our top level react components
import SomeReactComponent       from './src/SomeReactComponent';

class Main extends ReactHabitat.Bootstrapper {

  constructor(){

    super();

    // Create a new container
    var container = new ReactHabitat.Container();

    // Register our components that we want to expose to the DOM
    container.register('SomeReactComponent', SomeReactComponent);

    // Set the DOM container
    this.setContainer(container);

  }
}


export default new Main();