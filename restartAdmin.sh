
#start
ps -ef|grep admin-3.1|grep -v grep|awk '{print $2}'|xargs kill -9

nohup java -Xms128m -Xmx512m -XX:PermSize=128M -XX:MaxNewSize=256m -XX:MaxPermSize=256m  -XX:-UseGCOverheadLimit -Duser.timezone=GMT+08 -server -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=30801 -jar admin-3.1.jar > /data/server/log/admin31_`date '+%F_%H-%M-%S'`.log 2>&1  &

echo 'start finished!'

