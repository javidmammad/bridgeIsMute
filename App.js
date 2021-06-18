import React from 'react';
import AndroidMuteCtrlModule from './AndroidMuteCtrlModule';

export default function App() {
  const  sayHiFromJava = (arg) => {
    console.log(arg);
  };

  AndroidMuteCtrlModule.isMuted(sayHiFromJava);
  return <></>;
}
