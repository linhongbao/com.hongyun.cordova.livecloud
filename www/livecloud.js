var exec = require('cordova/exec');

module.exports = {
    start: function(startInfo,onSuccess,onError){
        exec(onSuccess, onError, "livecloud", "start", [startInfo]);
    }
};