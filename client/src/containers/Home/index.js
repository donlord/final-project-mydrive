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
  width: 20%; /* Set the width of the sidebar */
  padding-top: 20px;
  margin:auto;
  float: left;
`

const SideLink = styled.a`
  display: block;
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  color: black;
  text-decoration: none;
`
const RightContent = styled.div`
  padding-top 20px;
  float: right;
  height: 100%;
  width: 70%;
`
const PathContentBar = styled.div`
  display: flex;
  flex-direction: row;
  align-items: center;
  font-size: 32pt;
  width: 100%;
  border: 1px solid black;
`
const Path = styled.p`
  margin: 5px;
  width: 100%;
`
const CreateButton = styled.a`
`
const UploadButton = styled.a`
  margin-left: 20px;
`

const LeftContent = styled.div`
  height: 100%;
`
const ButtonGroup = styled.div`
  display: flex;
  justify-content: flex-end;
  width: 25%;
  // margin-left: 0;
`

const Row = styled.div`
 display: flex;
 flex-direction: row;
 font-size: 22pt;
//  padding-right: 4px;
width: 100%;
`
const RowContent = styled.div`
 display: flex;
 width: 100%;
`
const RowIcons = styled.div`
 display: flex;
 justify-content: flex-end;
 width: 15%;
 align-items: center;
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
        <LeftContent>
          <Sidebar>
            <SideLink href='DriveButton'>drive</SideLink>
            <SideLink href='TrashButton'>trash</SideLink>
          </Sidebar>
        </LeftContent>
        <RightContent>
          <PathContentBar>
            <Path>MyDrive/</Path>
            <ButtonGroup>
              <CreateButton>Create</CreateButton>
              <UploadButton>Upload</UploadButton>
            </ButtonGroup>
          </PathContentBar>
          <Row style={{ backgroundColor: 'lightgrey' }}>
            <RowContent>
              <i className='far fa-folder fa-3x' />
              <p>Yellow Kitty/kittyOne</p>
            </RowContent>
            <RowIcons>
              <i
                style={{ marginRight: '25px' }}
                className='fas fa-file-download fa-2x'
              />
              <i
                style={{ marginRight: '25px' }}
                className='far fa-trash-alt fa-2x'
              />
            </RowIcons>
          </Row>
          <Row>
            <i className='far fa-folder fa-3x' />
            <p>Yellow Kitty/</p>
          </Row>
          <Row style={{ backgroundColor: 'lightgrey' }}>
            <i className='far fa-folder fa-3x' />
            <p>Yellow Kitty/</p>
          </Row>
          <Row>
            <i className='far fa-file fa-3x' />
            <p>Yellow Kitty.png</p>
          </Row>
          <Row style={{ backgroundColor: 'lightgrey' }}>
            <i className='far fa-file fa-3x' />
            <p>Yellow Kitty.jpg</p>
          </Row>
          <Row>
            <i className='far fa-file fa-3x' />
            <p>Yellow Kitty.jpeg</p>
          </Row>
          <Row style={{ backgroundColor: 'lightgrey' }}>
            <i className='far fa-file-archive fa-3x' />
            <p>Yellow Kitty.zip</p>
          </Row>
        </RightContent>
        <form
          method='POST'
          enctype='multipart/form-data'
          action='/files/example'
        >
          <table>
            <tr>
              <td>File to upload:</td><td><input type='file' name='file' /></td>
            </tr>
            <tr><td /><td><input type='submit' value='Upload' /></td></tr>
          </table>
        </form>
      </div>
    )
  }
}

Home.propTypes = {}

const mapStateToProps = state => {}

const mapDispatchToProps = state => {}

export default connect(mapStateToProps, mapDispatchToProps)(Home)
