- how and where to store data

    -   สร้าง Class แยกเป็นสี่ไฟล์ โดยใช้สามไฟล์ในการเก็บข้อมูลที่เกี่ยวข้องกับ RPG Character และอีกหนึ่งไฟล์เป็น Class Main ที่เอาไว้ใช้ในการรันโค้ดทดสอบ โดยใช้ความรู้เกี่ยวกับ Encapsulation โดยแยกคลาสออกเป็น Character, Sword และ Shield ตัวแปรในแต่ละคลาสซึ่งทำหน้าที่เก็บข้อมูลต่างๆ ที่เกี่ยวข้องกับคลาส 
จะทำการกำหนดค่าการเข้าถึง public และ private เพื่อจำกัดความสามารถในการเข้าถึงข้อมูลต่างๆ ตามที่เราต้องการ
  - Class Character : จะเก็บข้อมูลี่เกี่ยวกับตัวละคร ได้แก่
  
    - name (private final String name)
    - level (private int level)
    - attack (private double atk)
    - defend (private int def)
    - maximum HP (private int maxHP)
    - maximum Mana (private int maxMana)
    - maximum run speed (private double maxRunSpeed)
    - current hp (private int currentHP)
    - current mana (private int currentMana)
    - base run speed (private final double baseRunSpeed)
    - equipped sword (Sword equippedSword)
    - equipped shield (Shield equippedShield)
  - Class Sword : จะเก็บข้อมูลที่เกี่ยวกับอุปกรณ์ประเภทดาบ ได้แก่
    
    - Sword level (int level)
    - Sword attack (public int Satk)
  - Class Shield : จะเก็บข้อมูลเกี่ยวกับอุปกรณ์ประเภทโล่ ได้แก่

    - Shield level (private final int level)
    - Shield Defend (public int)
  - Class Main : ใช้ในการรันทดสอบโค้ดของ Method และ field ที่อยู่ในสาม Class ข้างต้น  
- what operations are needed
  
  - Class Character

    - void levelUp() :
      
      - เรียกใช้เพิ่มเพิ่มเลเวลตัวละคร
    - void equipSword(Sword sword)
  
      - เรียกใช้เพื่อสวมใส่ดาบ
    - void equipShield(Shield shield)

      - เรียกใช้เพื่อสวมใส่โล่
    - void takeDamage(double damage)

      - เรียกใช้เพื่อเปลี่ยนค่า hp จากการถูกโจมตี
    - void fireball(int manaCost)

      - เรียกใช้เพื่อปล่อยสกิลโดยจะมีการกินค่า mana ถ้ามี mana ไม่เพียงพอจะไม่สามารถใช้ได้
    - void ShowName()

      - เรียกใช้เพื่อแสดงชื่อตัวละคร
    - void ShowStatus()

      - เรียกใช้เพื่อแสดงสเตตัสพลังโจมตีและพลังป้องกัน
    - void ShowHMR()

      - เรียกใช้เพื่อแสดงสเตตัสเกจ HP, Mana และ Run speed
    - void ShowCurrentHP()

      - เรียกใช้เพื่อแสดงค่า HP ในขณะนั้นของตัวละคร
    - void ShowCurrentMana()

      - เรียกใช้เพื่อแสดงค่า Mana ในขณะนั้นของตัวละคร
    - public static void attack(Character attacker, Character target)

      - เป็น class method ที่เรียกใช้เพื่อออกแอคชั่นการโจมตีระหว่างสองตัวละคร โดย input ตัวแรกเป็น Character ที่ทำการโจมตี และ input ตัวที่สองเป็น Character ที่ถูกโจมตี
    - private void updateRunSpeed()

      - เป็น method ที่ใช้ในการอัปเดตความเร็วของตัวละคร
    - private void updateStat()

      - เป็น method ที่ใช้ในการอัปเดตค่าสเตตัสต่างๆ หลังจากที่ตัวแปร level เพิ่มขึ้น โดยถูกเรียกใช้ใน method void level()
    - private double calculateMaxSpeed()

      - ใช้เรียกเพิ่อคำนวณค่า maximum speed ที่เปลี่ยนแปลงไปตามค่า level
  - Class Sword

    - public double calculateRunSpeedDecrease(int characterLevel)

      - ใช้เรียกเพื่อคำนวณค่าความเร็วที่ลดลงหลังจากที่สวมใส่
    - public double calculateDamage(int characterLevel)

      - ใช้เพื่อคำนวณพลังโจมตีที่เพิ่มขึ้นหลังจากสวมใส่

  - Class  Shield

    - public double calculateRunSpeedDecrease(int characterLevel)

      - ใช้เรียกเพื่อคำนวณค่าความเร็วที่ลดลงหลังจากที่สวมใส่
    -  public double reduceDamage(double incomingDamage, int characterLevel)

    - ใช้เพื่อคำนวณค่าความเสียหายที่ลดลงหลังจากสวมใส่โล่

- how and where to compute information
  
  - สร้าง object character จากนั้นก็เรียกใช้ 
operation ต่างๆ ที่มีในคลาส นอกจากนั้นก็ลองสร้าง object equipment และสวมใส่ให้กับตัวละคร ลองเพิ่มเลเวลตัวละคร เรียกดูสเตตัส ลองโจมตี ๆลๆ
  - เลือก Class Main ในการเป็นที่เอาไว้ใช้คำนวณสิ่งที่กล่าวในข้างต้น


