import { Box, Modal } from '@mui/material'
import React from 'react'
import { useLocation, useNavigate } from 'react-router-dom'
import { style } from '../../utils/ModelStyles'
import LoginForm from './LoginForm'
import RegisterForm from './RegisterForm'
import { useSelector } from 'react-redux'


function Auth() {

  const { token } = useSelector(state => state.auth)
  
  const location = useLocation()
  const navigate  = useNavigate()
  
  const { pathname } = location

    console.log("Current Path:", pathname);

    const handleOnClose = () => {
      navigate('/')
  }
    
  return (
      //might be causing the login page issue
    <Modal onClose={handleOnClose} open={ pathname=== "/account/register" || pathname=== "/account/login"}>


      <Box sx={style}>
          {
            pathname === "/account/register" ? <RegisterForm /> : <LoginForm />
          }
      </Box>
    </Modal>
  )
}

export default Auth
// <Modal
// onClose={handleOnClose}
// open={ pathname=== "/account/register" || pathname=== "/account/login"}
// disableAutoFocus
// disableEnforceFocus
// >