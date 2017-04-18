import React, { Component } from 'react';

class Header extends Component {
  
  
  render() {
    return (
	  <a href={this.props.logoUrl}>{this.props.logoLabel}</a>
    );
  }
}

export default Header;