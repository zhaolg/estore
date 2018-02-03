package com.estore.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.estore.job.annotation.ELasticJob;

/**
 * Created by zhaolg on 2018/2/2
 *
 * @return
 * @throws Exception
 */
@ELasticJob(cron = "* * * * * ?",jobName = "SynchronizeDataJob",shardingTotalCount = 10)
public class SynchronizeDataJob implements SimpleJob{

    @Override
    public void execute(ShardingContext shardingContext) {
        {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }
            System.out.println(System.currentTimeMillis()+": 当前任务调度：分片总数为："+ shardingContext.getShardingTotalCount()+"--->"+"当前任务的分片项为：" + shardingContext.getShardingItem());
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.getMessage();
            }

        }
    }
}
