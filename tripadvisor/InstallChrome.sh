#!/bin/bash

TARGET=google-chrome-stable_current_amd64.deb

# install curl
sudo apt install -yqqq curl

# install
curl -L https://dl.google.com/linux/direct/$TARGET -o $TARGET
sudo dpkg -i $TARGET
rm $TARGET

# remove yourself
rm $0
