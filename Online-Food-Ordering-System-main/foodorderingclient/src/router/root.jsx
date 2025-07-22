import { Outlet, useNavigate } from "react-router-dom"
import NavBar from "../components/NavBar"
import Auth from "../components/Auth/Auth";
import { useSelector } from "react-redux";
import { useEffect } from "react";
import { ToastContainer, toast } from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import { jwtDecode } from "jwt-decode";

const Root = () => {

    const { token } = useSelector(state => state.auth)
    const navigate = useNavigate()

    const isTokenExpired = () => {
        if (!token) return true
        try {
            const decodedToken = jwtDecode(token)
            const currentTime = Date.now() / 1000
            return decodedToken.exp < currentTime
        } catch (error) {
            return true
        }
    }

    //BUG: This effect runs on every render, which is not optimal.
    // It should only run once when the component mounts.
    //--------------------------------------------------------------------
    // useEffect(() => {
    //     if (isTokenExpired()) {
    //         localStorage.removeItem('jwtToken');
    //         toast.error('Session expired, please login again')
    //         navigate('/account/login')
    //     }
    // }, [])

    useEffect(() => {
        const checkToken = () => {
            if (isTokenExpired()) {
                localStorage.removeItem('jwtToken');
                toast.error('Session expired, please login again');
                navigate('/account/login');
            }
        };

        checkToken();
    }, []);

    return (
        <>
            <NavBar />
            <main>
                <Outlet />
            </main>
            <Auth />
            <ToastContainer position="top-right" autoClose={2000}/>
        </>
    )
}

export default Root;