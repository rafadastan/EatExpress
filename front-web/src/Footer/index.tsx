import './style.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as LinkedinIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';


function Footer(){
    return (
        <footer className="main-footer">
            App desenvolvido para aplicativo delivery. Projeto em andamento
            <div className="footer-icons">
                <a href="http://youtube.com.br" target="_new"><YoutubeIcon /></a>
                <a href="http://linkedin.com.br" target="_new"><LinkedinIcon /></a>
                <a href="http://instagram.com.br" target="_new"><InstagramIcon /></a>
            </div>
        </footer>
    )
}

export default Footer;