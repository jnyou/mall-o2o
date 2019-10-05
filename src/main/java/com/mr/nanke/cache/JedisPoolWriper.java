package com.mr.nanke.cache;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 创建jedispool 有三个参数，其中poolConfig可以不用配置，使用默认即可，host；主机，port:端口号
 * @author 夏小颜
 *
 */
public class JedisPoolWriper {
	//Redis连接池对象
	private JedisPool jedisPool;
	
	public JedisPoolWriper(final JedisPoolConfig poolConfig, final String host,
			final int port) {
		try {
			jedisPool = new JedisPool(poolConfig, host, port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

}
