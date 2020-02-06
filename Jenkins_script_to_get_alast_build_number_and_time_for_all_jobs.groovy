 Jenkins.instance.getAllItems(Job.class).each{ 
  //println it.getFullName()
 def job_data = Jenkins.instance.getItemByFullName(it.getFullName()) 
   if (job_data.getLastBuild()) {
            last_job_num = job_data.getLastBuild().getNumber()
            def upStreamBuild = Jenkins.getInstance().getItemByFullName(it.getFullName()).getBuildByNumber(last_job_num)
println it.getFullName() + ' LastBuildNumer: ' + last_job_num + " LastBuildTime: ${upStreamBuild.getTime()}"
        } else {
            println 'LastBuildNumer: Null'
        }
 }
