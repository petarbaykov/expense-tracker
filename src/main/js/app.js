const React = require('react')
const ReactDOM = require('react-dom');
// const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
    }

    render() {
        return (
            <div>Test</div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)