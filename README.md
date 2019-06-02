# Commands

### Build
`docker build . -t learnjavathehardway`

### Run with directory bind mount 
` docker run -it --name ljthw -v "$(pwd)":/code learnjavathehardway bash`
