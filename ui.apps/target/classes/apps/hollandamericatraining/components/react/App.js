import ReactHabitat from 'react-habitat';

import SomeReactComponent from './src/SomeReactComponent';

class Main extends ReactHabitat.Bootstrapper {

  constructor(){

    super();

    // Create a new container
    var container = new ReactHabitat.Container();
    
    container.register('SomeReactComponent', SomeReactComponent);

    // Set the DOM container
    this.setContainer(container);

  }
}


export default new Main();