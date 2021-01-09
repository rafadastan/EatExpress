import './style.css';
import {ReactComponent as Logo} from './logo.svg';
import { Link } from 'react-router-dom';

function NavBar(){
    return (
        <nav className="main-navbar">
            <Logo />
            <Link to="/" className="logo-text">Eat Express</Link>

        </nav>
    )
}

export default NavBar;