import ReactHabitat from 'react-habitat';

import Header from './src/Header';

import MenuItem from './src/MenuItem';

class Main extends ReactHabitat.Bootstrapper {

  constructor(){

    super();

    // Create a new container
    var container = new ReactHabitat.Container();
    
    container.register('Header', Header);
    container.register('MenuItem', MenuItem);

    // Set the DOM container
    this.setContainer(container);
    

  }
}


export default new Main();