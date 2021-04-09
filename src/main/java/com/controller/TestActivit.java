//package com.controller;
//
//import org.activiti.engine.ProcessEngine;
//import org.activiti.engine.ProcessEngineConfiguration;
//import org.activiti.engine.RuntimeService;
//import org.activiti.engine.TaskService;
//import org.activiti.engine.runtime.ProcessInstance;
//import org.activiti.engine.task.Task;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class TestActivit {
//
//
// public static void main(String[] args) {
//
//  ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();
//
//////  部署流程图
////  //2.得到RepositoryService实例
////  RepositoryService repositoryService = processEngine.getRepositoryService();
////
////  //3.进行部署
////  Deployment deployment = repositoryService.createDeployment()
////   .addClasspathResource("processes/test.bpmn")  //添加bpmn资源
////   .name("请假申请单流程")
////   .deploy();
////
////  //4.输出部署的一些信息
////  System.out.println(deployment.getName());
////  System.out.println(deployment.getId());
//
////  动流程    相当于java类   new了一个实例启
//  // 流程定义key
//  Map<String,Object> map=new HashMap<>();
//  map.put("user1","张三");
//  map.put("user2","李四");
//  map.put("user3","王五");
//  map.put("user4","赵六");
//  String processDefinitionKey = "myProcess_1";
//// 获取RunTimeService
//  RuntimeService runtimeService = processEngine.getRuntimeService();
//// 根据流程定义key启动流程
//  ProcessInstance processInstance = runtimeService
//   .startProcessInstanceByKey(processDefinitionKey,map);
//  System.out
//   .println(" 流 程 定 义 id ： " +
//    processInstance.getProcessDefinitionId());
//  System.out.println("流程实例id：" + processInstance.getId());
////  System.out.println("当前活动Id：" + processInstance.getActivityId());
//
//
//
//  // 流程定义key
//  String processDefinitionKey = "myProcess_1";
//// 任务负责人
//  String user1 = "张三";
//// 创建TaskService
//  TaskService taskService = processEngine.getTaskService();
//  List<Task> list = taskService.createTaskQuery()//
//   .processDefinitionKey(processDefinitionKey)//
//   .includeProcessVariables().taskAssignee(user1).list();
//  for (Task task : list) {
//   System.out.println("----------------------------");
//   System.out.println("流程实例id：" + task.getProcessInstanceId());
//   System.out.println("任务id：" + task.getId());
//   System.out.println("任务负责人：" + task.getAssignee());
//   System.out.println("任务名称：" + task.getName());
//  }
//
// }
//}
