import React, { Component } from 'react';

class MenuItem extends Component {
  
  render() { 	
    return (
		<div>
		    <div>{this.props.sectionLabel}</div>
		    <ul>
		      {this.props.link1Label !== '' ? <li><a href={this.props.link1URL}>{this.props.link1Label}</a></li> : null}
		      {this.props.link2Label !== '' ? <li><a href={this.props.link2URL}>{this.props.link2Label}</a></li> : null}
		      {this.props.link3Label !== '' ? <li><a href={this.props.link3URL}>{this.props.link3Label}</a></li> : null}
		      {this.props.link4Label !== '' ? <li><a href={this.props.link4URL}>{this.props.link4Label}</a></li> : null}
		      {this.props.link5Label !== '' ? <li><a href={this.props.link5URL}>{this.props.link5Label}</a></li> : null}
		      {this.props.link6Label !== '' ? <li><a href={this.props.link6URL}>{this.props.link6Label}</a></li> : null}
		    </ul>
		  </div>
    );
  }
}

export default MenuItem;