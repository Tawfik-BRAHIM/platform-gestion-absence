import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EligrpComponent } from './eligrp.component';

describe('EligrpComponent', () => {
  let component: EligrpComponent;
  let fixture: ComponentFixture<EligrpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EligrpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EligrpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
