# Scanfold-SpringCloud-RibbonOnly

纯Ribbon配置，只用Ribbon做负载均衡，不包含Spring-cloud环境以及Eureka

在这种情况下，默认实现类：

 - 服务实例列表维护机制实现的接口ServerList： ConfigurationBasedServerList
 - 负责选取Server的接口ILoadBalancer：ZoneAwareLoadBalancer
 - 负载均衡选取规则实现的接口IRule：ZoneAvoidanceRule
 - 检查实例是否存活实现的接口IPing：NoOpPing
 - 服务实例列表更新机制实现的接口ServerListUpdater：PollingServerListUpdater
 - 服务实例列表过滤机制ServerListFilter：ZonePreferenceServerListFilter