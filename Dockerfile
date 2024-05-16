FROM node:10-alpine

RUN mkdir -p /home/node/nodejs-app/node_modules && chown -R node:node /home/node/nodejs-app

WORKDIR /home/node/nodejs-app

COPY package*.json ./

USER node

RUN npm install

COPY --chown=node:node . .

EXPOSE 8080

CMD [ "node", "index.js" ]