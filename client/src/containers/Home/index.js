import React from 'react'
import connect from 'react-redux/es/connect/connect' // TODO: whats going on here
import styled from 'styled-components'

const Header = styled.div`
    display: flex;
    justify-content: space-evenly;
    font-size: 32pt;
`

const HomeButton = styled.a`
    margin-right: auto;
    background-color: lightblue;
    color: black;
    text-decoration: none;
`

const UserButton = styled.a`
    color: black;
    text-decoration: none;
`

const Sidebar = styled.div`
    font-size: 32pt;
    height: 100%; /* Full-height: remove this if you want "auto" height */
    width: 160px; /* Set the width of the sidebar */
    padding-top: 20px;
`

const SideLink = styled.a`
    display: block;
    padding: 6px 8px 6px 16px;
    text-decoration: none;
    color: black;
    text-decoration: none;
`

class Home extends React.Component {
  render () {
    return (
      <div>
        <Header>
          <HomeButton href='HomeButton'>
            my drive
          </HomeButton>
          <UserButton href='UserButton'>
            account
          </UserButton>
        </Header>
        <Sidebar>
          <SideLink href='DriveButton'>drive</SideLink>
          <SideLink href='TrashButton'>trash</SideLink>
        </Sidebar>
      </div>
    )
  }
}

Home.propTypes = {}

const mapStateToProps = state => {}

const mapDispatchToProps = state => {}

export default connect(mapStateToProps, mapDispatchToProps)(Home)
