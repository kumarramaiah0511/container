FROM node as initial
WORKDIR /app
COPY package.json .
COPY server1.js  .
RUN ["npm","install"]
EXPOSE 3000
CMD ["node", "server1.js"]
